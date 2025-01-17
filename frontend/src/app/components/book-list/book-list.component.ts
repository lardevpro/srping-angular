import {Component, OnInit} from '@angular/core';
import {Book} from '../../models/book';
import {BookService} from '../services/book.service';
import {NgForOf, NgOptimizedImage} from '@angular/common';
import { MatCardModule } from '@angular/material/card';



@Component({
  selector: 'app-book-list',
  standalone: true,
  imports: [
    NgForOf, MatCardModule, NgOptimizedImage
  ],
  templateUrl: './book-list.component.html',
  styleUrl: './book-list.component.css',
})
export class BookListComponent implements OnInit{
  books?: Book[];

  constructor(private bookService: BookService) { }

  ngOnInit() {
    this.fetchBooks();
  }


  fetchBooks() {
    this.bookService.findAll().subscribe( {
      next: value=>{
        this.books = value;
        console.log('Books: ---> ', this.books);
        console.log('Books: ---> ', this.books[0].urlImg);
      },
      error: e=>{
        console.log('Intenéntelo de nuveo más tarde, error: ', e);
    },
    });
  }


}
