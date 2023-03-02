// Call the dataTables jQuery plugin
$(document).ready(function() {
    // on ready
  });
  
  
  async function registrarUsuarios(){
    let datos = {};
    datos.nombre   = document.getElementById('txtNombre').value;
    datos.apellido = document.getElementById('txtApellido').value;
    datos.email    = document.getElementById('txtEmail').value;
    //datos.telefono = document.getElementById('txtTelefono').value;
    datos.password = document.getElementById('txtPassword').value;

    let repetirPassword = document.getElementById('txtRepetirPassword').value;
    if(repetirPassword != datos.password){
        alert('La contrasena es diferente');
        return;
    }

      fetch('/api/usuarios', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
      })
      .then(response => {
        if (!response.ok) {
          throw new Error('Error al guardar persona');
        }
        return response.text();
      })
      .then(data => {
        console.log(data);
        alert('Persona guardada correctamente');
      })
      .catch(error => {
        console.error(error);
        alert('Error al guardar persona');
      });
    }    
  
  
  
  
