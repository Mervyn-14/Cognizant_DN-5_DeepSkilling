import React from "react";
import Post from "./Post";

class Posts extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            posts: []
        };
    }

    loadPosts() {
        fetch("https://jsonplaceholder.typicode.com/posts")
            .then(response => response.json())
            .then(data => {

                const posts = data.map(
                    post => new Post(post.id, post.title, post.body)
                );

                this.setState({
                    posts: posts
                });

            })
            .catch(error => {
                console.error(error);
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        alert("Error : " + error);
        console.log(info);
    }

    render() {

        return (

            <div>

                <h1>Blog Posts</h1>

                {
                    this.state.posts.map(post => (

                        <div
                            key={post.id}
                            style={{
                                border: "1px solid gray",
                                padding: "10px",
                                marginBottom: "10px"
                            }}
                        >

                            <h2>{post.title}</h2>

                            <p>{post.body}</p>

                        </div>

                    ))
                }

            </div>

        );
    }

}

export default Posts;