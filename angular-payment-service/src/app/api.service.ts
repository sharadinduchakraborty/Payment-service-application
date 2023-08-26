import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private baseUrl = 'http://localhost:8080/api'; // Update with your backend URL

  constructor(private http: HttpClient) {}

  registerUser(username: string, password: string): Observable<any> {
    const user = { username, password };
    return this.http.post(`${this.baseUrl}/users/register`, user);
  }

  // Implement more methods for other API calls (login, transactions, payment methods, etc.)
}
