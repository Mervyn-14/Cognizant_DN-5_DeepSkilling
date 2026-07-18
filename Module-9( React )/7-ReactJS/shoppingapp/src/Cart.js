import React from "react";

class Cart extends React.Component {

    render() {

        return (

            <tr>
                <td>{this.props.itemName}</td>
                <td>₹ {this.props.price}</td>
            </tr>

        );

    }

}

export default Cart;