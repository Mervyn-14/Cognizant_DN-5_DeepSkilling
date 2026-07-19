import React from "react";

class CountPeople extends React.Component {

    constructor() {
        super();

        this.state = {
            entryCount: 0,
            exitCount: 0
        };
    }

    updateEntry = () => {
        this.setState((prevState) => ({
            entryCount: prevState.entryCount + 1
        }));
    };

    updateExit = () => {
        this.setState((prevState) => ({
            exitCount: prevState.exitCount + 1
        }));
    };

    render() {

        return (

            <div style={{ textAlign: "center", marginTop: "80px" }}>

                <button onClick={this.updateEntry}>
                    Login
                </button>
                <span style={{ marginLeft: "10px", marginRight: "60px" }}>
                    {this.state.entryCount} People Entered!!
                </span>
                <button onClick={this.updateExit}>
                    Exit
                </button>

                <span style={{ marginLeft: "10px" }}>
                    {this.state.exitCount} People Left!!
                </span>

            </div>

        );

    }

}

export default CountPeople;