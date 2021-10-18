import { combineReducers } from 'redux';
import serieRecucer from './serieReducer'

export default combineReducers({
    series: serieRecucer
});