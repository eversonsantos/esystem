import { Raca } from './../../model/raca';
import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator, MatSort, MatTableDataSource } from "@angular/material";


@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {
  
  racas: Array<Raca> = [];
  raca: Raca = new Raca();

  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;

  displayedColumns: string[] = ["codigo", "nome", "acao"];
  dataSource: MatTableDataSource<Raca>;

  constructor() { }

  ngOnInit() {
    this.dataSource = new MatTableDataSource([]);
    for (let i = 0; i < 100; i++) {
      let raca: Raca = new Raca();
      raca.setCodigo(i);
      raca.setNome("Raça" + i);
      this.racas.push(raca);
    }
    this.dataSource.data = this.racas;
  }

  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }

  push(): void {
    this.raca.setCodigo(this.racas.length + 1);
    this.racas.push(this.raca);
    this.dataSource.data = this.racas;
    this.clean();
  }
  edit(raca : Raca): void {
    this.raca = raca;
  }

  clean(): void {
    this.raca = new Raca();
  }

}
