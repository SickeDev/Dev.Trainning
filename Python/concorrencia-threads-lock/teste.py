import threading

contador = 0
lock = threading.Lock()

def somar():
    global contador

    for _ in range(1000):
        with lock:
            contador += 1

thread1 = threading.Thread(target=somar)
thread2 = threading.Thread(target=somar)

thread1.start()
thread2.start()

thread1.join()
thread2.join()

print("Resultado:", contador)
