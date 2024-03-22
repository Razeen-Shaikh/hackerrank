import cmath
import re

complex_str = input()
match = re.match(r'(-?\d+(?:\.\d+)?)\s*([-+])\s*(\d+(?:\.\d+)?)j', complex_str)
if match:
    real_part_str = match.group(1)
    imaginary_sign = match.group(2)
    imaginary_part_str = match.group(3)

real_part = float(real_part_str)
imaginary_part = float(imaginary_sign + imaginary_part_str)
number = complex(real_part, imaginary_part)

magnitude = abs(number)

phase_angle = cmath.phase(number)

print(magnitude)
print(phase_angle)
