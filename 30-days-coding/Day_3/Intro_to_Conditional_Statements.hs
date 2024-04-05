{-# LANGUAGE FlexibleInstances, UndecidableInstances, DuplicateRecordFields #-}

module Main where

import Control.Monad
import Data.Array
import Data.Bits
import Data.List
import Data.List.Split
import Data.Set
import Debug.Trace
import System.Environment
import System.IO
import System.IO.Unsafe

isWeird n = do
    if n `mod` 2 /= 0 then putStrLn "Weird"
        else if n >= 2 && n <= 5 then putStrLn "Not Weird"
            else if n >= 6 && n <= 20 then putStrLn "Weird"
                else putStrLn "Not Weird"

main :: IO()
main = do
    n <- readLn :: IO Int
    isWeird n
