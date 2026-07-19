import React from "react";

class CurrencyConvertor extends React.Component {

  constructor() {

    super();

    this.state = {

      amount: "",

      currency: ""

    };

  }

  handleSubmit = () => {

    const euro = this.state.amount / 90;

    this.setState({

      currency: euro.toFixed(2)

    });

    alert(
      "Converting to Euro Amount is " +
      euro.toFixed(2)
    );

  };

  render() {

    return (

      <div>

        <h1 style={{ color: "green" }}>
          Currency Convertor!!!
        </h1>

        <label>Amount</label>

        <input

          type="number"

          value={this.state.amount}

          onChange={(e) =>
            this.setState({
              amount: e.target.value
            })
          }

        />

        <br /><br />

        <label>Currency</label>

        <input

          value={this.state.currency}

          readOnly

        />

        <br /><br />

        <button onClick={this.handleSubmit}>
          Submit
        </button>

      </div>

    );

  }

}

export default CurrencyConvertor;