import { useContext } from "react";
import ThemeContext from "./ThemeContext";

function EmployeeCard(props) {

    const theme = useContext(ThemeContext);

    return (

        <div
            style={{
                border: "1px solid gray",
                padding: "15px",
                margin: "10px"
            }}
        >

            <h2>{props.employee.name}</h2>

            <p>{props.employee.designation}</p>

            <button className={theme}>
                View Profile
            </button>

        </div>

    );

}

export default EmployeeCard;