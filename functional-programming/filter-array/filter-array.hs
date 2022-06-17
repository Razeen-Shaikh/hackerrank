f :: Int -> [Int] -> [Int]
f n arr = [x | x <- arr, x < n]      --Fill up this function

main = do 
    n <- readLn :: IO Int 
    input_data <- getContents 
    let 
        numbers = map read (lines input_data) :: [Int] 
    putStrLn . unlines $ (map show . f n) numbers
