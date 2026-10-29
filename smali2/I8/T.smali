.class public final LI8/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# instance fields
.field public final q:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI8/T;->q:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, LI8/T;->q:Ljava/lang/Throwable;

    throw p0
.end method
