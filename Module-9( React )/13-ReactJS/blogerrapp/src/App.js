import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

import "./App.css";

function App() {

    return (

        <div
            style={{
                display:"flex",
                justifyContent:"space-around",
                marginTop:"40px"
            }}
        >

            <CourseDetails />

            <BookDetails />

            <BlogDetails />

        </div>

    );

}

export default App;