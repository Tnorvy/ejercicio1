var rt = 10, rl = 2, rm = 7, vT = 5, vL = 65, vM = 2.6, rOT = 100, rOL = 20, rOM = 150, rS = 15;
var px, py; var lapiz, iniAmin, oAnim, ta = 0, logs, fondo;
//Dibuja un círculo de rad y color dadas en el punto de la órbita
function astro(cx, rad, color) {
    lapiz.arc(cx, 0, rad, 0, 2 * Math.PI);
    lapiz.fillStyle = color;
    lapiz.fill();
    lapiz.strokeStyle = color; lapiz.stroke();
}
//Calcula la posición de un astro en un punto de la órbita gira el canvas y lo coloca en un extremo del diametro horizontal pero girado 
function orbita(tiempo, vel, ra, ro, color, dib) {
    if (dib) dibOrbita(ro, color);
    lapiz.beginPath();
    lapiz.rotate(vel * tiempo * Math.PI / 2000);
    astro(ro, ra, color);
}
function dibOrbita(rOrb, color) {
    lapiz.beginPath();
    lapiz.strokeStyle = color;
    lapiz.arc(0, 0, rOrb, 0, 2 * Math.PI);
    lapiz.stroke();
}
function mover(time) {
    var ta = Math.round((time - iniAnim) / 10);
    //controla la velocidad de la animación 
    var vis = true;
    lapiz.putImageData(fondo, 0, 0);
    lapiz.save();
    orbita(ta, vT, rt, rOT, "blue", vis);
    lapiz.translate(rOT, 0);
    orbita(ta, vL, rl, rOL, "pink", vis);
    lapiz.restore();
    lapiz.save();
    orbita(ta, vM, rm, rOM, "red", vis);
    lapiz.restore(); oAnim = window.requestAnimationFrame(mover);
}
function iniciar() {
    marco = document.getElementById("marco");
    lapiz = marco.getContext("2d");
    logs = document.getElementById("texto");
    px = marco.width / 2;
    py = marco.height / 2;
    lapiz.translate(px, py);
    astro(0, rS, "yellow");
    lapiz.beginPath();
    fondo = lapiz.getImageData(0, 0, marco.width, marco.height);
    iniAnim = window.performance.now(); oAnim = window.requestAnimationFrame(mover)
} 