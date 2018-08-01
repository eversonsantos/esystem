import { Component, OnInit, ViewChild} from '@angular/core';
import { Raca } from "./../../model/raca";
import { Personagem } from "./../../model/personagem";
import { Membro } from "./../../model/membro";

import { MatPaginator, MatSort, MatTableDataSource } from "@angular/material";

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  membro: Membro = new Membro();
  personagem: Personagem = new Personagem();
  membros: Array<Membro> = [];



  displayedColumns: string[] = ["codigo", "nome", "acao"];
  dataSource: MatTableDataSource<Raca>;

  constructor() {
    
  }

  ngOnInit() {

  }

  ngAfterViewInit() {
  }

  addPersonagem(): void {
    this.membro.getPersonagens().push(this.personagem);
    this.personagem = new Personagem();
  }

  push(): void {
    this.clean();
  }
  edit(membro : Membro): void {
  }

  clean(): void {
    this.membro = new Membro();
  }
}
