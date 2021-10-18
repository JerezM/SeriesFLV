import React, { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';

import { retrieveSeriesAction } from "../redux/actions/serieAction"

//import Serie from './Serie'


const SerieList = () => {

    const dispatch = useDispatch();

    useEffect(() => {
        const fetchSeries = () => dispatch(retrieveSeriesAction());
        fetchSeries();
    },[]);

    const series = useSelector(state => state.series.series)

    return (
        <div className="serie-list">
            <h1>Series</h1>

            <ul className="list-group">
                {console.log(series)
                /*series.map( serie => 
                    <li>
                        <Serie
                            key = {item.id}
                            id = {item.id}
                            item = {item}
                        />
                    </li>
                    )
                */}
            </ul>

        </div>
    );

}

export default SerieList;