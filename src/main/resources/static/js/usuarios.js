// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarUsuarios();
  $('#usuarios').DataTable();
});


async function cargarUsuarios(){


    const request = await fetch('usuarios', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    const usuarios = await request.json();
  
    console.log(usuarios);

    let usuario = '<tr><td>123</td><td>Prueba Hugo Pozos</td><td>pozo@outlook.es</td><td>2123123123</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';

    document.querySelector('#usuarios tbody').outerHTML = usuario;
}
