import { Component } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent {
  username: string = '';
  password: string = '';

  constructor(private authService: AuthService) {}

  registerUser(): void {
    this.authService.register(this.username, this.password)
      .subscribe(response => {
        console.log('Registration successful:', response);
        // You can navigate to a different page here.
      }, error => {
        console.error('Registration failed:', error);
      });
  }
}
