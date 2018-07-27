import { Funcao } from './domain/funcao.enum';
import { Personagem } from './model/personagem';
import { Membro } from './model/membro';
import { Component } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'app';
  membro : Membro = new Membro();
  personagem : Personagem = new Personagem();
  membros : Array<Membro> = [];

  
  addPersonagem(): void {
    this.membro.getPersonagens().push(this.personagem);
    this.personagem = new Personagem();
  }

  push() : void {
    this.membros.push(this.membro);
    this.clean();
  }
  clean() : void {
    this.membro = new Membro();
  }
}
