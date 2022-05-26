## PseudoCódigo (Pseint)

    Algoritmo ejercicio4 

        Definir tEntrada, hrs, min, seg Como Entero 
        
        Escribir "Ingrese la cantidad de segundos:" 
        
        Leer tEntrada 
        
        hrs <- trunc(tEntrada / 3600) 
        
        min <- trunc((tEntrada - hrs*3600) / 60) 
        
        seg <- trunc(tEntrada - (hrs*3600 + min*60)) 
        
        Escribir "El número de horas son: ",hrs  
        
        Escribir "El número de minutos son: ",min 
        
        Escribir "El número de segundos son: ",seg  
    
    FinAlgoritmo 
