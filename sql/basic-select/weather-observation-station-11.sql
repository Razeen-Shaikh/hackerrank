select distinct
    (city)
from
    station
where
    city REGEXP '^[^aeiouAEIOU]'
    or city REGEXP '[^aeiouAEIOU]$';