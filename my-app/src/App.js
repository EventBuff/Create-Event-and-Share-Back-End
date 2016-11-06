import React, { Component } from 'react';
import './App.css';
import Event from './Event';
import Navigation from './Navigation';
import { Form, FormControl, Navbar, Glyphicon,
  Nav, NavItem, Well, Row, Col, Button } from 'react-bootstrap';

class App extends Component {
  constructor(props) {
    super(props);

    this.state = {
      current: 'Event'
    };
    this.handleClick = this.handleClick.bind(this);
  }
  
  handleClick(e) {
    console.log('click ', {e});
    var c = this.state.current;
    console.log('click ', {c});
    // alert(`selected ${e}`);
    this.setState({
      current: {e}.e
    });
    c = this.state.current;
    console.log('click ', {c});
  }


  render() {
    var content;
    switch (this.state.current) {
      case "Event":
        content =  <Event />;
        break;
      case 2:
        content =  "This key is 2";
        break;
      default:
        content = "ss";
    }
    var c = this.state.current;
    console.log('click ', {c});
    return (
      <div className="App-main">
        <Navigation />
      </div>
    );
  }
}

export default App;
