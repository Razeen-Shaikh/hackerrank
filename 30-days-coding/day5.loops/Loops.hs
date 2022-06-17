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

table n i = do
    putStrLn (show n ++ " x " ++ show i ++ " = " ++ show (n * i))
    if i < 10 then table n (i+1) else return()

main :: IO()
main = do
    n <- readLn :: IO Int
    let i = 1
    table n i
