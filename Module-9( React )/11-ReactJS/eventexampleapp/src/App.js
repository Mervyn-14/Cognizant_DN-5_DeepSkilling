import React from "react";
import CurrencyConvertor from "./CurrencyConvertor";

class App extends React.Component {

  constructor() {
    super();

    this.state = {
      count: 0
    };
  }

  increment = () => {
    this.setState({
      count: this.state.count + 1
    });
  };

  decrement = () => {
    this.setState({
      count: this.state.count - 1
    });
  };

  sayHello = () => {
    alert("Hello! Member");
  };

  sayWelcome = (msg) => {
    alert(msg);
  };

  onPress = () => {
    alert("I was clicked");
  };

  handleIncrement = () => {
    this.increment();
    this.sayHello();
  };

  render() {

    return (

      <div style={{ margin: "20px" }}>

        <h2>{this.state.count}</h2>

        <button onClick={this.handleIncrement}>
          Increment
        </button>

        <br /><br />

        <button onClick={this.decrement}>
          Decrement
        </button>

        <br /><br />

        <button
          onClick={() => this.sayWelcome("Welcome")}
        >
          Say Welcome
        </button>

        <br /><br />

        <button onClick={this.onPress}>
          Click on me
        </button>

        <br /><br />

        <CurrencyConvertor />

      </div>

    );

  }

}

export default App;