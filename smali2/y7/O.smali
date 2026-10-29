.class public final synthetic Ly7/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld/b;


# instance fields
.field public final synthetic a:Ly7/S;


# direct methods
.method public synthetic constructor <init>(Ly7/S;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/O;->a:Ly7/S;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .registers 2

    iget-object p0, p0, Ly7/O;->a:Ly7/S;

    check-cast p1, Ld/a;

    invoke-static {p0, p1}, Ly7/S;->d0(Ly7/S;Ld/a;)V

    return-void
.end method
