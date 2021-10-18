import React, { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { Card, Row, Col } from 'react-bootstrap';

import { retrieveSeriesAction } from '../redux/actions/serieAction';

import imgTest from '../testImg.jpg';


//import SerieListElement from './SerieListElement'


const SerieList = () => {

    const dispatch = useDispatch();

    useEffect(() => {
        const fetchSeries = () => dispatch(retrieveSeriesAction());
        fetchSeries();
    },[]);

    const series = useSelector(state => state.series.series);


    return (
        <div className="serie-list">
            <h2>Series</h2>

            <Row xs={4} md={6} className="g-4">
                {series.map( serie => (
                    <Col>
                        <Card>
                            <Card.Img variant="top" src={imgTest} />
                            <Card.Body>
                                <Card.Title>{serie.serieName}</Card.Title>
                            </Card.Body>
                        </Card>
                    </Col>
                ))}
            </Row>

        </div>
    );

}

export default SerieList;