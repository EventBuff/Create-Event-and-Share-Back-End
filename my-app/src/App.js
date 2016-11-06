import React, { Component } from 'react';
import './App.css';
import Event from './Event'
import { SiderMenu, Form, FormControl, Navbar, Glyphicon,
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
        <Row>
          <Col span={20} offset={2}>
            <div className="main-top">Even Search</div>
          </Col>
        </Row>
        <Nav bsStyle="pills" activeKey={2} onSelect={this.handleClick}>
          <NavItem eventKey="Event" href="/home">NavItem 1 content</NavItem>
          <NavItem eventKey={2} title="Item">NavItem 2 content</NavItem>
          <NavItem eventKey="3" disabled>NavItem 3 content</NavItem>
        </Nav>
        <div className="content-div">
              {content}
            </div>
      </div>
    );
  }
}

export default App;
