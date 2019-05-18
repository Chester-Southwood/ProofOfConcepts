function addressMaker(city, state)
{
    //oldWay const newAddress = {newCity: city, newState: state};
    //use only if make sense context
    
    const newAddress = {city, state};

    console.log(newAddress);
}

addressMaker('Austin', 'Texas');