import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';

//Redux
import { Provider } from 'react-redux';
import store from './store';
import SerieList from './component/SerieList';
import Header from './component/Header';

function App() {
  return (
    <Provider store={store}>
      <Router>
        <Header/>
        <div className="app">
          <Switch>
            <Route exact path={["/", "/series"]} component={SerieList} />
          </Switch>
        </div>
      </Router>
    </Provider>
  );
}

export default App;
