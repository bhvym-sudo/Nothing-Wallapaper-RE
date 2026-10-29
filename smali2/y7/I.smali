.class public final synthetic Ly7/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Ly7/S;


# direct methods
.method public synthetic constructor <init>(Ly7/S;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/I;->q:Ly7/S;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Ly7/I;->q:Ly7/S;

    invoke-static {p0}, Ly7/S;->j0(Ly7/S;)LD7/c;

    move-result-object p0

    return-object p0
.end method
