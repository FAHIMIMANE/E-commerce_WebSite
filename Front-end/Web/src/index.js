import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import store from './store';
import './bootstrap.min.css';
import './index.css';
import reportWebVitals from './reportWebVitals';
import { Provider } from 'react-redux';

ReactDOM.render(
  <Provider store={store}>
    <React.StrictMode>
      <App />
    </React.StrictMode>
  </Provider>,
  document.getElementById('root')
);


reportWebVitals();
