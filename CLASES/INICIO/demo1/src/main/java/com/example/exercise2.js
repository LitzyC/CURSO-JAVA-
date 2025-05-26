
function palidromo(palabra){
    let letra =  palabra;
    const palabralimpia=letra.toLowerCase();
    const palabrainversa=letra.split("").reverse().join("");;

    if (palabralimpia === palabrainversa){
        console.log(true)
    }

}

console.log(palidromo());