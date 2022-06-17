{-# LANGUAGE FlexibleInstances, UndecidableInstances, DuplicateRecordFields #-}

module Main where

import Control.Monad
import Data.Array
import Data.Bits
import Data.List
import Data.Set
import Debug.Trace
import System.Environment
import System.IO
import System.IO.Unsafe

printString 0 = return ()
printString n = do
    putStrLn "Hello World"
    printString (n-1)

main :: IO()
main = do
    n <- readLn :: IO Int
    -- replicateM_ n $ putStrLn "Hello World"
    printString n
