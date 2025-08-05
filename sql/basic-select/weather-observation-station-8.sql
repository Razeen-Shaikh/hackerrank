select distinct
    (city)
from
    station
where
    city REGEXP '^[aeiouAEIOU]'
    and city REGEXP '[aeiouAEIOU]$';