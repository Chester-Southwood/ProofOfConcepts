const personalInformation = {
    firstName = 'Chester',
    lastName = 'Southwood',
    city = 'Cheney',
    state = 'Washington',
    zipCode = 99004
};

const {
    firstName: fn,
    lastName: ln
} = personalInformation;

console.log(`${fn} ${ln}`);