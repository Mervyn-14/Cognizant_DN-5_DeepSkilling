import React from "react";

import Greeting from "./Greeting";
import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";

class App extends React.Component {

    constructor() {

        super();

        this.state = {

            isLoggedIn: false

        };

    }

    handleLoginClick = () => {

        this.setState({

            isLoggedIn: true

        });

    };

    handleLogoutClick = () => {

        this.setState({

            isLoggedIn: false

        });

    };

    render() {

        const isLoggedIn = this.state.isLoggedIn;

        let button;

        if (isLoggedIn) {

            button = (

                <LogoutButton

                    onClick={this.handleLogoutClick}

                />

            );

        } else {

            button = (

                <LoginButton

                    onClick={this.handleLoginClick}

                />

            );

        }

        return (

            <div style={{ margin: "40px" }}>

                <Greeting

                    isLoggedIn={isLoggedIn}

                />

                {button}

            </div>

        );

    }

}

export default App;