import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import { Router, Route, IndexRoute, hashHistory, browserHistory } from 'react-router'
// import Navigation from './Navigation';
import NotFound from './NotFound';
import Event from './Event';
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap/dist/css/bootstrap-theme.css';
import './index.css';

const Home = () => <h1>Hello from Home!</h1>
const routes =
<Router history={browserHistory}>
  <Route path="/" component={App}>
    <IndexRoute component={Home} />
    <Route path='/event' component={Event} />
    <Route path='/event' component={Event} />
    <Route path='*' component={NotFound} />
  </Route>
</Router>;

ReactDOM.render(
  routes,
  document.getElementById('root')
);
