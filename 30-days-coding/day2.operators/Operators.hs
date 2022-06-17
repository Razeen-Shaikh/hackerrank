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

-- Complete the solve function below.
solve meal_cost tip_percent tax_percent = do
    let tip = meal_cost * (fromIntegral tip_percent) / 100
        tax = meal_cost * (fromIntegral tax_percent) / 100
        totalCost = meal_cost + tip + tax
    print (round totalCost)

main :: IO()
main = do
    meal_cost <- readLn :: IO Double

    tip_percent <- readLn :: IO Int

    tax_percent <- readLn :: IO Int

    solve meal_cost tip_percent tax_percent
