select distinct
    (city)
from
    station
where
    city regexp '^[^aeiouAEIOU]'
    and city regexp '[^aeiouAEIOU]$';