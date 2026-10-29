.class public final synthetic Ly7/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Ly7/S;


# direct methods
.method public synthetic constructor <init>(Ly7/S;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/P;->q:Ly7/S;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, Ly7/P;->q:Ly7/S;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p0, p1}, Ly7/S;->n0(Ly7/S;I)Lh8/A;

    move-result-object p0

    return-object p0
.end method
