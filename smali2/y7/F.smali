.class public final synthetic Ly7/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Ly7/S;


# direct methods
.method public synthetic constructor <init>(Ly7/S;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/F;->q:Ly7/S;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Ly7/F;->q:Ly7/S;

    invoke-static {p0}, Ly7/S;->i0(Ly7/S;)V

    return-void
.end method
