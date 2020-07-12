def solution(x, y):
    mach = int(x)
    facula = int(y)
    counter = 0
    
    while (mach > 0 and facula > 0):
        if (mach == 1 and facula == 1):
            break
        if (facula > mach):
            if (facula > 1000*mach):
                factor = int(facula/mach)
                facula -= mach*(factor)
                counter += factor
            else :
                facula -= mach
                counter += 1
        elif (mach > facula):
            if (mach > 1000*facula):
                factor = int(mach/facula)
                mach -= facula*(factor)
                counter += factor
            else :
                mach -= facula
                counter += 1
        else:
            return 'impossible'
    return str(counter)