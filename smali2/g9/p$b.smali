.class public final Lg9/p$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg9/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg9/p;->a(Lg9/d;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LF8/l;


# direct methods
.method constructor <init>(LF8/l;)V
    .registers 2

    iput-object p1, p0, Lg9/p$b;->a:LF8/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lg9/d;Ljava/lang/Throwable;)V
    .registers 4

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "t"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lg9/p$b;->a:LF8/l;

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p2}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Lg9/d;Lg9/x;)V
    .registers 6

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lg9/x;->d()Z

    move-result v0

    if-eqz v0, :cond_72

    invoke-virtual {p2}, Lg9/x;->a()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_68

    invoke-interface {p1}, Lg9/d;->b()LP8/B;

    move-result-object p1

    const-class p2, Lg9/o;

    invoke-virtual {p1, p2}, LP8/B;->i(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    check-cast p1, Lg9/o;

    invoke-virtual {p1}, Lg9/o;->b()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p1}, Lg9/o;->a()Ljava/lang/reflect/Method;

    move-result-object p1

    new-instance v0, Lh8/g;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Response from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " was null but response body type was declared as non-null"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lh8/g;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Lg9/p$b;->a:LF8/l;

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    invoke-static {v0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_68
    iget-object p0, p0, Lg9/p$b;->a:LF8/l;

    invoke-static {p2}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_72
    iget-object p0, p0, Lg9/p$b;->a:LF8/l;

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    new-instance p1, Lg9/m;

    invoke-direct {p1, p2}, Lg9/m;-><init>(Lg9/x;)V

    invoke-static {p1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
