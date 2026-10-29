.class public final synthetic LK6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:LK6/a$b;


# direct methods
.method public synthetic constructor <init>(LK6/a$b;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/b;->a:LK6/a$b;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .registers 2

    iget-object p0, p0, LK6/b;->a:LK6/a$b;

    check-cast p1, Lg3/a;

    invoke-static {p0, p1}, LK6/a$b;->k(LK6/a$b;Lg3/a;)V

    return-void
.end method
