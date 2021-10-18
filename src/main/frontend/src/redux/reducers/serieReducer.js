import { RETRIEVE_SERIES } from '../actions/types'

const initialState = {
    series: [],
}

export default function serieReducer(state = initialState, action) {
    const { type, payload } = action;

    switch (type) {

        case RETRIEVE_SERIES:
            return ({
                ...state,
                series: payload
            });

        default:
            return state;

    }
}