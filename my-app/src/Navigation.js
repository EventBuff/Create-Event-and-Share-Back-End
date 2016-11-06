/*
* @Author: Lich Amnesia
* @Date:   2016-11-06 14:58:09
* @Last Modified by:   Lich Amnesia
* @Last Modified time: 2016-11-06 15:33:28
*/

/*
* @Author: Lich Amnesia
* @Date:   2016-11-04 14:51:22
* @Last Modified by:   Lich Amnesia
* @Last Modified time: 2016-11-06 14:57:43
*/

import React, { Component } from 'react';
import logo from './logo.svg';
import './Navigation.css';
import Event from './Event';
import axios from 'axios';
import { Navbar, Nav, NavItem, NavDropdown, MenuItem, Badge, Button }
  from 'react-bootstrap';

class Navigation extends Component {
  constructor(props) {
    super(props);

    this.state = {
      posts: '',
      value: '',
      content: ''
    };
    this.myFunction = this.myFunction.bind(this);
    this.handleClick = this.handleClick.bind(this);
  }
  
  myFunction(){
    axios.get('/greeting?name=2', {
        // name: 2
      }).then(res => {
        const posts = res.data.content;
        this.setState({ posts });
      });
   }

  componentDidMount() {
    // this.myFunction();
    
    //     res => {
    //     const posts = res.data;
    //     this.setState({ posts });
    // });
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
    var value = this.state.value;
    var posts = this.state.posts;
    var content = this.state.content;
    // Display get product button
    const searchEventButton =
      <Button
          onClick={this.searchEvent}
          bsStyle="success"
          bsSize="large">Search
      </Button>;
    switch (this.state.current) {
      case "Search Event":
        content =  <Event />;
        break;
      case 2:
        content =  "This key is 2";
        break;
      default:
        content = "ss";
    }
    return (
      <div>
        <Navbar inverse collapseOnSelect>
          <Navbar.Header>
            <Navbar.Brand>
              <a href="#">Event Create and Share</a>
            </Navbar.Brand>
            <Navbar.Toggle />
          </Navbar.Header>
          <Navbar.Collapse>
            <Nav onSelect={this.handleClick}>
              <NavItem eventKey="Create" href="/Home">Create Event</NavItem>
              <NavItem eventKey="Search Event" ref="#">Search Event</NavItem>
            </Nav>
            <Nav pullRight>
              <NavDropdown eventKey={3} title="Dropdown" id="basic-nav-dropdown">
                <MenuItem eventKey={3.1}>Action</MenuItem>
                <MenuItem eventKey={3.2}>Another action</MenuItem>
                <MenuItem eventKey={3.3}>Something else here</MenuItem>
                <MenuItem divider />
                <MenuItem eventKey={3.3}>Separated link</MenuItem>
              </NavDropdown>
              <NavItem eventKey={1} href="#">Profile</NavItem>
            </Nav>
          </Navbar.Collapse>
        </Navbar>
        <div className="content-div">
            {content}
        </div>
      </div>
    );
  }
}

export default Navigation;
