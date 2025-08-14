select
    n,
    case
        when p is null then 'Root'
        when n not in (
            select distinct
                p
            from
                bst
            where
                p is not null
        ) then 'Leaf'
        else 'Inner'
    end as NodeType
from
    bst
order by
    n;