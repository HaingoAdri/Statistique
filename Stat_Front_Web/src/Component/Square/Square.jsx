import React from "react";
import style from "./Square.css";
class Square extends React.Component {
    render() {
      return (
        <button className="square">
          {this.props.value}
        </button>
      );
    }
  }

  export default Square