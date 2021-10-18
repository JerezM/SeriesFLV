import { RETRIEVE_SERIES } from './types'

import axiosClient from '../../config/axios'

export function retrieveSeriesAction() {
    return async (dispatch) => {
        try {
            const response = await axiosClient.get('/api/series');
            dispatch({ type: RETRIEVE_SERIES, payload: response.data })
        } catch (err) {
            console.error(err);
        }
    }
}