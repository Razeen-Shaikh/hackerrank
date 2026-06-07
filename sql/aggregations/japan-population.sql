-- Query the sum of the populations for all Japanese cities in CITY. The CountryCode for Japan is JPN.
SELECT sum(population)
FROM city
WHERE countrycode = 'JPN';