.class abstract Lb6/c$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "f"
.end annotation


# instance fields
.field final synthetic a:Lb6/c;


# direct methods
.method private constructor <init>(Lb6/c;)V
    .registers 2

    .line 2
    iput-object p1, p0, Lb6/c$f;->a:Lb6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lb6/c;Lb6/d;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lb6/c$f;-><init>(Lb6/c;)V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;)V
.end method
