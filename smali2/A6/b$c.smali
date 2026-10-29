.class public final LA6/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/U$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA6/b;->o(Lh3/a0;Lg3/x;Landroid/graphics/Bitmap;Landroid/app/WallpaperColors;Lx6/k;ILm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg3/x;

.field final synthetic b:Lm8/e;

.field final synthetic c:Lx6/k;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lg3/x;Lm8/e;Lx6/k;I)V
    .registers 5

    iput-object p1, p0, LA6/b$c;->a:Lg3/x;

    iput-object p2, p0, LA6/b$c;->b:Lm8/e;

    iput-object p3, p0, LA6/b$c;->c:Lx6/k;

    iput p4, p0, LA6/b$c;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .registers 7

    invoke-static {}, LA6/b;->b()Lq6/b;

    move-result-object v0

    iget-object v1, p0, LA6/b$c;->a:Lg3/x;

    invoke-virtual {v1}, Lg3/x;->k()LC6/g;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-virtual {v1}, LC6/g;->c()Ljava/lang/String;

    move-result-object v1

    goto :goto_12

    :cond_11
    const/4 v1, 0x0

    :goto_12
    iget v2, p0, LA6/b$c;->d:I

    invoke-static {v2}, LG6/g;->b(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "blur daemon set "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " failed,e:"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lq6/b;->c(Ljava/lang/String;)V

    iget-object p1, p0, LA6/b$c;->c:Lx6/k;

    invoke-virtual {p1}, Lx6/k;->i()V

    iget-object p0, p0, LA6/b$c;->b:Lm8/e;

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Lg3/x;I)V
    .registers 8

    invoke-static {}, LA6/b;->b()Lq6/b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Lg3/x;->r()Ljava/lang/String;

    move-result-object p1

    goto :goto_d

    :cond_c
    move-object p1, v1

    :goto_d
    iget-object v2, p0, LA6/b$c;->a:Lg3/x;

    invoke-virtual {v2}, Lg3/x;->k()LC6/g;

    move-result-object v2

    if-eqz v2, :cond_1a

    invoke-virtual {v2}, LC6/g;->c()Ljava/lang/String;

    move-result-object v2

    goto :goto_1b

    :cond_1a
    move-object v2, v1

    :goto_1b
    invoke-static {p2}, LG6/g;->b(I)Ljava/lang/String;

    move-result-object p2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "blur daemon set "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " success."

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lq6/b;->c(Ljava/lang/String;)V

    new-instance p1, LA6/b$c$a;

    iget-object p2, p0, LA6/b$c;->c:Lx6/k;

    invoke-direct {p1, p2, v1}, LA6/b$c$a;-><init>(Lx6/k;Lm8/e;)V

    const/4 p2, 0x1

    invoke-static {v1, p1, p2, v1}, LF8/g;->f(Lm8/i;Lv8/p;ILjava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, LA6/b$c;->b:Lm8/e;

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
