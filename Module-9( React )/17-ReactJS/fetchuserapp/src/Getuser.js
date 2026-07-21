import React, { Component } from "react";

class Getuser extends Component {

  constructor(props) {
    super(props);

    this.state = {
      title: "",
      firstName: "",
      image: "",
      loading: true
    };
  }

  async componentDidMount() {

    const url = "https://api.randomuser.me/";

    const response = await fetch(url);

    const data = await response.json();

    const person = data.results[0];

    this.setState({

      title: person.name.title,

      firstName: person.name.first,

      image: person.picture.large,

      loading: false

    });

  }

  render() {

    if (this.state.loading) {

      return <h2>Loading...</h2>;

    }

    return (

      <div style={{ marginLeft: "50px", marginTop: "50px" }}>

        <h1>

          {this.state.title} {this.state.firstName}

        </h1>

        <img

          src={this.state.image}

          alt="User"

        />

      </div>

    );

  }

}

export default Getuser;